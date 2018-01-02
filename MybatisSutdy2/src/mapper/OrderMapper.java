package mapper;

import java.util.List;

import com.xx.pojo.Order;

public interface OrderMapper {
	List<Order> queryOrderAll();
	
	/**
	 * 一对一关联
	 * @return
	 */
	List<Order> queryOrderUserResultMap();
}
