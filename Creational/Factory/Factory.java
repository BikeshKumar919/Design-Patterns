public class Factory {
    public static Role getRole(String role){
        if (role == null){
            return null;
        }
        if (role.equalsIgnoreCase("WEBDEV")){
            return new WebDev();
        }
        else if (role.equalsIgnoreCase("ANDROIDDEV")){
            return new AndroidDev();
        }
        else if (role.equalsIgnoreCase("FREE")){
            return new Free();
        }
        return null;
    }
}
