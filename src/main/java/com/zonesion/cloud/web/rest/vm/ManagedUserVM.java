package com.zonesion.cloud.web.rest.vm;

import com.zonesion.cloud.service.dto.UserDTO;
import javax.validation.constraints.Size;

import java.time.Instant;
import java.util.Set;

/**
 * View Model extending the UserDTO, which is meant to be used in the user management UI.
 */
public class ManagedUserVM extends UserDTO {

    public static final int PASSWORD_MIN_LENGTH = 4;

    public static final int PASSWORD_MAX_LENGTH = 100;

    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    private String password;

    public ManagedUserVM() {
        // Empty constructor needed for Jackson.
    }

	public ManagedUserVM(Long id, String login, String password, String name, String avatar, String email,
			String mobile, String sex, String staffNo, String major, String school, boolean activated, String createdBy,
			Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, Set<String> authorities) {

		super(id, login, name, avatar, email, mobile, sex, staffNo, major, school, activated, createdBy, createdDate,
				lastModifiedBy, lastModifiedDate, authorities);

        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ManagedUserVM{" +
            "} " + super.toString();
    }
}
