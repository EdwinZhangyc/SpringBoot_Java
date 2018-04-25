package contacts;

import java.util.List;

public interface ContactRepository {
    public abstract List<Contact> findAll();

    void save(Contact contact);
}