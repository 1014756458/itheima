package cn.itheima.service.Imp;

import cn.itheima.dao.ItemsDao;
import cn.itheima.domain.Items;
import cn.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImp implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
