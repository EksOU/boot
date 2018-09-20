package life.eks.demo.dubbo;

/**
 * @author Eks OU
 */
public interface HelloDubboService {

    /**
     * say hello
     * @param name say hello name
     * @return say hello
     */
    String sayHello(String name);

}