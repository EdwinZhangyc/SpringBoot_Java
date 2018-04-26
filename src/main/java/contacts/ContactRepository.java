package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ContactRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Contact> findAll(){
        return jdbcTemplate.query("select id, firstName, lastName, phoneNumber, emailAddress " +
                        "from contact order by lastName",
                //new RowMapper<Contact>() {
                //    @Override
                //    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
                //        Contact contact = new Contact();
                //        contact.setId(rs.getLong(1));
                //        contact.setFirstName(rs.getString(2));
                //        contact.setLastName(rs.getString(3));
                //        contact.setPhoneNumber(rs.getString(4));
                //        contact.setEmailAddress(rs.getString(5));
                //        return contact;
                //    }
                //}
                (rs, rowNum) -> {
                    return new Contact(
                            rs.getLong(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5)
                            );
                }
        );
    }

    public void save(Contact contact){
        jdbcTemplate.update(
            "INSERT INTO contact(firstName, lastName, phoneNumber, emailAddress) VALUES (?, ?, ?, ?)",
                contact.getFirstName(),
                contact.getLastName(),
                contact.getPhoneNumber(),
                contact.getEmailAddress()
        );
    }
}