package br.com.wm.clines.api.users;

import org.springframework.stereotype.Component;

import br.com.wm.clines.shared.domain.User;
import br.com.wm.clines.shared.infra.Mapper;

@Component
public class UserViewMapper implements Mapper<User, UserView> {

	@Override
	public UserView map(User source) {
		return new UserView(source.getName(), source.getEmail());
	}

}
