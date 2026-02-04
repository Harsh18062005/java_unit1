public class Wrap
{
    public static void main(String[] args)
    {
        // Demonstrating Integer Wrapper Class
        Integer intObj = Integer.valueOf(10);
        System.out.println("Integer Object: " + intObj);

        // Demonstrating Double Wrapper Class
        Double doubleObj = Double.valueOf(5.5);
        System.out.println("Double Object: " + doubleObj);

        // Demonstrating Character Wrapper Class
        Character charObj = Character.valueOf('A');
        System.out.println("Character Object: " + charObj);

        // Demonstrating Boolean Wrapper Class
        Boolean boolObj = Boolean.valueOf(true);
        System.out.println("Boolean Object: " + boolObj);

        // Unboxing example
        int unboxedInt = intObj.intValue();
        System.out.println("Unboxed Integer: " + unboxedInt);

        // Size of Wrapper Objects
        System.out.println("Size of Integer Object in bytes: " + Integer.BYTES);
        System.out.println("Size of Double Object in bytes: " + Double.BYTES);
        System.out.println("Size of Character Object in bytes: " + Character.BYTES);
        System.out.println("Size of Boolean Object in bytes: " + 1); // Boolean size is not defined, typically 1 byte
        System.out.println("Size of Integer Primitive in bytes: " + Integer.SIZE / 8);
        System.out.println("Size of Double Primitive in bytes: " + Double.SIZE / 8
);
        System.out.println("Size of Character Primitive in bytes: " + Character.SIZE / 8  );
        System.out.println("Size of Boolean Primitive in bytes: " + 1); // Boolean     
    }
}   