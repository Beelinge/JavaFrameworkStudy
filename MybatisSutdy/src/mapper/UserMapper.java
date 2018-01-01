package mapper;

import com.xx.pojo.User;

public interface UserMapper {
	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	User queryUserById(Integer id);

}
