package cn.itheima;
import cn.itheima.domain.Items;
import cn.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void findById(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ItemsDao itemsDaoImp = app.getBean(ItemsDao.class);
//        Items items = itemsDaoImp.findById(1);
//        System.out.println(items);
        ItemsService itemsService = app.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items);


    }
}
