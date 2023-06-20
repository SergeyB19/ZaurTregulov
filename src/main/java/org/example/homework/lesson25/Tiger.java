package org.example.homework.lesson25;

public class Tiger {

    public void eat(String str) {
        if (!str.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + str);
        }
    }


    public void drink(String str) throws NeVodaException {
        if (!str.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + str);
        }
            System.out.println("Tigr pyet vodu");
    }


    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally  block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
        }






