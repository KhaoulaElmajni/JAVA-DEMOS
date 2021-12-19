package TP3.Exercice2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
public class Contact {
    private String name;
    private long phone;

    public Contact() {
    }

    public Contact(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phone == contact.phone && this.name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
