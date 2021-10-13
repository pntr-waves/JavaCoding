package core;

import java.util.HashMap;
import java.util.Map;

import service.CustomerService;
import service.ICustomerService;
import service.IMembershipService;
import service.ITransactionService;
import service.MembershipService;
import service.TransactionService;

public class ServiceFactory {
	private static Map<Class<?>, Object> map  = new HashMap<>();
	
	static {
		init();
	}

	private static void init() {
		register(ICustomerService.class, new CustomerService());
		register(IMembershipService.class, new MembershipService());
		register(ITransactionService.class, new TransactionService());
	}
	
	public static <T> void register(Class<T> clazz, T t) {
		map.put(clazz, t);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T get(Class<T> clazz) {
		return (T) map.get(clazz);
	}
	
}
