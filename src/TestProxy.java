import java.lang.reflect.Proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		PayDao payDao = new PayImp();
		
		PayDao payDaoProxy  = (PayDao)Proxy.newProxyInstance(TestProxy.class.getClassLoader(), payDao.getClass().getInterfaces(), new MyProxyHandler(payDao));
		payDaoProxy.pay();
	}
}
