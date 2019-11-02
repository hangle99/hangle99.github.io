package com.example.PhamMemHSG1.entity;
import java.io.Console;
import java.io.Serializable;
import java.util.stream.Stream;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerator implements IdentifierGenerator {
	  private String prefix = "DV";
	  @Override
	  public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
	    System.out.println('s');
		String query = "SELECT e.tenDangNhap FROM DonViDuThi e";
	    Stream<String> tenDangNhaps = session.createQuery(query, String.class).stream();
	    Long max = tenDangNhaps.map(o -> o.replace(prefix, "")).mapToLong(Long::parseLong).max().orElse(0L);
	    return prefix + (String.format("%04d", max + 1));
	  }

}
