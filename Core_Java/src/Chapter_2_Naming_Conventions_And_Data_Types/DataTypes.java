package Chapter_2_Naming_Conventions_And_Data_Types;

/*-------------- Data Types -------------- */

// 1. Primitive Data Types
// 2. Reference Data Types

/* -------------- Primitive Data Types -------------- */

// 1. Integer Data Types
/*
 *  1. byte:    8 bits,     (-128 to 127)
 *  2. short:   16 bits,    (-32768 to 32767)
 *  3. int:     32 bits,    (-2147483648 to 2147483647)
 *  4. long:    64 bits,    (-9223372036854775808 to 9223372036854775807)
 *  5. float:   32 bits,    (-3.402823466E38 to 3.402823466E38)
 *  6. double:  64 bits,    (-1.7976931348623157E308 to 1.7976931348623157E308)
 */
// 2. Character Data Types
/*
 *  1. char:    16 bits,    (0 to 65535)
 */
// 3. Boolean Data Types
/*
*  1. boolean:  1 bit,      (true or false)
*/

/* -------------- Reference Data Types -------------- */
// 1. String
// 2. Arrays
// 3. Classes
// 4. Interfaces
// 5. Enums
// 6. Annotations

public class DataTypes {

    // Main method
    public static void main(String[] args) throws Exception {

        // Invoking the all methods
        primitiveDataTypes();
        referenceDataTypes();

    }

    // 1. Primitive Data Types
    public static void primitiveDataTypes() {

        // 1. Integer Data Types
        byte byteVar = 100;
        short shortVar = 2_000;
        int intVar = 30_000;
        long longVar = 4_00_000L;
        float floatVar = 5_00_000.0f;
        double doubleVar = 10_00_000.0;

        System.out.println("byteVar = " + byteVar + "\n" + "shortVar = " + shortVar + "\n" + "intVar = " + intVar + "\n"
                + "longVar = " + longVar + "\n" + "floatVar = " + floatVar + "\n" + "doubleVar = " + doubleVar);

        // 2. Character Data Types
        char charVar = 'A';
        System.out.println("charVar = " + charVar);

        // 3. Boolean Data Types
        boolean booleanVar = true;
        System.out.println("booleanVar = " + booleanVar);

    }

    // 2. Reference Data Types
    public static void referenceDataTypes() {

        // 1. String
        String stringVar = "Hello, World!";
        System.out.println("stringVar = " + stringVar);

        // 2. Arrays
        int[] intArray = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("intArray = " + intArray);

        // 3. Classes
        class Person {
        }

        // 4. Interfaces
        interface Animal {
        }

        // 5. Enums
        enum Color {
            RED, GREEN, BLUE
        }

        // 6. Annotations
        /*
         * @interface Annotation{
         * // It should be used at the class level
         * }
         */

    }

}
