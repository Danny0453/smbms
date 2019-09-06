package Test;


import com.githup.mybatis.dao.UserMapper;
import com.githup.mybatis.pojo.User;
import com.githup.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test2 {
	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			//1.或取sqlSeeion对象
			  sqlSession = SqlSessionUtil.getSqlSession();

			  //2.通过sqlSession获取userMapper的对象
			UserMapper userMapper =sqlSession.getMapper(UserMapper.class);

			//3。通过userMapper来执行各种操作
			//List<User> userList =userMapper.findUser();

			//通过名字来模糊查询
			//User user = userMapper.findUserByUserName("敏");

			//1.多个参数使用对象来传参数
			//User user= new User();
			//user.setUserName("敏");
			//user.setUserRole(2);
			 //user = userMapper.findUserByUserNameAdUserRole(user);

			//2.多个参数使用map集合来传递参数
			//Map<String,Object> map = new HashMap<>();
			//map.put("userName","敏");
			//map.put("userRole",2);
			//User user = userMapper.findUserByMap(map);
			//3.多个参数
			/*如果2个参数以内包含2个参数 推荐用注解传参  以上的推荐对象来传   不在一个对象里面的参数用map*/
			User user = userMapper.findUserByUserNameAdUserRole1("敏",2);
			System.out.println(user);

			//4.迭代userList
				/*for (User user : userList) {
				System.out.println(user);
			}*/
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
