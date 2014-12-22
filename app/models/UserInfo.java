package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class UserInfo extends Model {
	private static final long serialVersionUID = 1L;
	@Id
	public int id;
	public String username;
	public String email;
	public String password;

}
