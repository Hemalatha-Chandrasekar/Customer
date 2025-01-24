package service;

import model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;

public class ItemService {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session;
    Transaction transaction;
    public ItemService() {
        this.session = factory.openSession();
    }
    public void save() {
        transaction = session.beginTransaction();
        Item item1 = new Item("Laptop", new BigDecimal("1200.00"));
        session.persist(item1);

        Item item2 = new Item("Keyboard", new BigDecimal("75.00"));
        session.persist(item2);
        transaction.commit();
        System.out.println("Items are saved");
    }

    public void updateItem() {
        transaction = session.beginTransaction();
        Item item = session.get(Item.class, 1);
        if (item != null) {
            item.setPrice(new BigDecimal("1300.00"));
            session.merge(item);
            transaction.commit();
            System.out.println("Item updated");
        }
    }

    public void deleteItem (int id) {
        transaction = session.beginTransaction();
        Item item = session.get(Item.class, id);
        session.remove(item);
        transaction.commit();
    }
}