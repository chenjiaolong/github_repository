package cn.sx.service;

import java.util.List;

import cn.sx.entity.Buy;
import cn.sx.entity.Good;
import cn.sx.entity.User;


/* 有关查询业务的接口
* @author LCG
*
*/
public interface GoodService {
	List<Good> select(String Sort);
    List<Good> old();
    List<Good> heart();
    int addGood(Good good,String userNo);
    int delete(Good good);
    Good getById(String goodNo);
	int addbuyinfo(Buy buy, String goodNo);
	List<Buy>  getAll(String userNo);
	List<Good> getAll1(String userNo);
	int editseller(Good good,String userNo);
}
