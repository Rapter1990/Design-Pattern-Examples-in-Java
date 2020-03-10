package singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtilThreadSafeSingleton {

	private static SessionFactory factory;
	private static StandardServiceRegistry registry;

	public static synchronized Session getSessionFactory() {
		if (factory == null) {
			final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure("/config/hibernate.cfg.xml").build();
			try {
				factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			} catch (Exception e) {
				e.printStackTrace();
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
		}
		return factory.openSession();
	}

	public static void shutdown() {
		if (registry != null && factory != null) {
			factory.close();
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
