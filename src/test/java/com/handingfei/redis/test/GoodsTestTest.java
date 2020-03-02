package com.handingfei.redis.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.handingfei.util.StreamUtil;
import com.handingfei.util.StringUtil;

/**
 * 
 * @ClassName: GoodsTestTest 
 * @Description: TODO
 * @author: handingfei
 */
public class GoodsTestTest {

	@Test
	public void test() {
		
		List<GoodsTest> list = new ArrayList<GoodsTest>();
		List<String> list2 = StreamUtil.readFile2List(this.getClass().getCanonicalName());
		
		
		/**
		 * 循环导入
		 */
		for (String goodsTest1 : list2) {
			GoodsTest goodsTest = new GoodsTest();
			
			goodsTest.setName(StringUtil.randomChineseString(3));	
			
			goodsTest.setSex(StringUtil.generateChineseName());
			
			goodsTest.setPhone(1321332132);
			
			goodsTest.setEmail(StringUtil.randomChineseString(12));
			
			goodsTest.setBirthday(StringUtil.randomChineseString(23));
			
		}
		
	}

}
