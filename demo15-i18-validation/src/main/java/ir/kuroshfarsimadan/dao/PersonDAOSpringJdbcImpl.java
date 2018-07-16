package ir.kuroshfarsimadan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import ir.kuroshfarsimadan.bean.Person;

@Repository
public class PersonDAOSpringJdbcImpl implements PersonDAO {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Person p) {
		String sql = "insert into person(firstname, lastname, email, address, postalcode, postaloffice ) values(?,?,?,?,?,?)";

		final String firstname = p.getFirstname();
		final String lastname = p.getLastname();
		final String email = p.getEmail();
		final String address = p.getAddress();
		final String postalcode = p.getPostalcode();
		final String postaloffice = p.getPostaloffice();

		KeyHolder idHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql, new String[] { "id" });
				ps.setString(1, firstname);
				ps.setString(2, lastname);
				ps.setString(3, email);
				ps.setString(4, address);
				ps.setString(5, postalcode);
				ps.setString(6, postaloffice);
				return ps;
			}
		}, idHolder);

		p.setId(idHolder.getKey().intValue());

	}

	public Person find(int id) {
		String sql = "select * from person where id = ?";
		Object[] parameters = new Object[] { id };
		RowMapper<Person> mapper = new PersonRowMapper();
		Person p = jdbcTemplate.queryForObject(sql, parameters, mapper);
		return p;
	}

	public List<Person> retrieveAll() {
		String sql = "select * from person";
		RowMapper<Person> mapper = new PersonRowMapper();
		List<Person> persons = jdbcTemplate.query(sql, mapper);
		return persons;
	}

}
