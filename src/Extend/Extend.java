package Extend;

public class Extend {
    public static void main(String[] args) {
        UserSocial p = new UserSocial();
        System.out.println(p.getTextInfo());

        WebMaster w = new WebMaster();
        System.out.println(w.getTextInfo());

        UserSocial pNew = new UserSocial(3,"mark","honda45345","Oleg",25);
        WebMaster wNew = new WebMaster(5,"fdgdf","123456","xogf.com");
        System.out.println(pNew.getTextInfo());
        System.out.println(wNew.getTextInfo());


    }
    }

