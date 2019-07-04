package cm.manager.sso.service;

import com.manager.common.utils.E3Result;
import com.manager.pojo.TbUser;

public interface RegisterService {

	E3Result checkData(String param, int type);
	E3Result register(TbUser user);
}
