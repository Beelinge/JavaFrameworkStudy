package mapper;

import java.util.List;

import com.xx.pojo.QueryVo;
import com.xx.pojo.User;

public interface UserMapper {
	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	User queryUserById(Integer id);

	/**
	 * 根据包装包查询用户
	 * 
	 * @param queryVo
	 * @return
	 */
	List<User> queryUserByQueryVo(QueryVo queryVo);
	
	/**
	 * 根据条件查询用户
	 * @param user
	 * @return
	 */
	List<User> queryUserByWhere(User user);
	
	/**
	 * 一对多关联
	 * @return
	 */
	List<User> queryUserOrders();
}
