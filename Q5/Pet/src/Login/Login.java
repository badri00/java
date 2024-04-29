package Login;

import Exception.UnauthorizedException;

public class Login {
	private static String UloginId="admin";
	private static String Upassword = "admin";
	private static String CloginId="c1";
	private static String Cpassword="c1";
	
	public static boolean Adminlogin(String logineid,String password) throws UnauthorizedException {
		if(UloginId.equals(logineid)) {
			if(Upassword.equals(password)) {
				return true;
			}else {
				throw new UnauthorizedException("Invalide Password");
			}
		}else {
			throw new UnauthorizedException("Invalide loginId");
		}
	}
	
	public static  boolean Alllogin(String logineid,String password) throws UnauthorizedException {
		if(CloginId.equals(logineid) || UloginId.equals(logineid) ) {
			if(Cpassword.equals(password) || Upassword.equals(password)) {
				return true;
			}else {
				throw new UnauthorizedException("Invalide Password");
			}
		}else {
			throw new UnauthorizedException("Invalide loginId");
		}
	}
}

