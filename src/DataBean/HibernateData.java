package DataBean;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by henry_fordham on 2017/12/2.
 */
public class HibernateData {
    public static SessionFactory sessionFactory;
    static {
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure( "hibernate.cfg.xml" )
                .build();
        Metadata metadata = new MetadataSources( standardRegistry )
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE ).build();
        sessionFactory = metadata.getSessionFactoryBuilder()
                .build();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
