package com.example.demo.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.bean.PaymentCardDetail;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BinListServiceTest {
	
	@Autowired
	private BinListService binListService;
	
	@Test
	public void shouldCallBinList() {
		String code = "444433";
		PaymentCardDetail paymentCardDetail = binListService.getCardDetail(code);
		assertNotNull(paymentCardDetail.getScheme());
	}
}
