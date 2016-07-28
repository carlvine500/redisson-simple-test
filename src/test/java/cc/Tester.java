package cc;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.redisson.Config;
import org.redisson.Redisson;
import org.redisson.RedissonClient;
import org.redisson.core.RLock;

public class Tester {
	@Test
	public void testName() throws Exception {
		Config config = new Config();
		config.useClusterServers()//
				.addNodeAddress("10.126.53.248:8308")//
				.addNodeAddress("10.126.53.248:8309");//
		String lockName = "MYTEST:d";

		RedissonClient redisson = Redisson.create(config);
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			try {
				RLock lock = redisson.getLock(lockName);
				boolean tryLock1 = lock.tryLock(1, TimeUnit.SECONDS);
				System.out.println(tryLock1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
