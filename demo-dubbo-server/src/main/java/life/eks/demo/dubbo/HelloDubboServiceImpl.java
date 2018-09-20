package life.eks.demo.dubbo;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author Eks OU
 */
@Service(version = "1.0.0")
public class HelloDubboServiceImpl implements HelloDubboService {

	@Override
    public String sayHello(String name) {
        return "Hello, " + name + ", " + new Date();
    }

}