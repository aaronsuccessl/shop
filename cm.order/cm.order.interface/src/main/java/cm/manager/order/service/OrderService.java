package cm.manager.order.service;

import com.manager.common.utils.E3Result;
import cm.manager.order.pojo.OrderInfo;

public interface OrderService {
	E3Result createOrder(OrderInfo orderInfo);
}
