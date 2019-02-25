import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DogTest.
 *
 * @author  Dave Avis
 * @version 2.20.2019
 */
public class DogTest
{
    /**
     * Testing setting and getting age.
     */
    @Test(timeout=2000)
    public void ageTest()
    {
        int[] ages = { 5, 7, 10 };
        Dog d = new Dog();

        for( int age : ages )
        {
            d.setAge( age );
            assertEquals( "setAge() or getAge() failed (-12 points).", age, d.getAge() );
        }
    }

    /**
     * Testing setting and getting name.
     */
    @Test(timeout=2000)
    public void nameTest()
    {
        String[] names = { "Spot", "Rover", "Leo" };
        Dog d = new Dog();
        for( String name : names )
        {
            d.setName( name );
            assertEquals( "setName() or getName() failed (-12 points).", name, d.getName() );
        }
    }

    /**
     * Testing setting and getting breed
     */
    @Test(timeout=2000)
    public void breedTest()
    {
        String[] breeds = { "Spot", "Rover", "Leo" };
        Dog d = new Dog();
        for( String breed : breeds )
        {
            d.setBreed( breed );
            assertEquals( "setBreed() or getBreed() failed (-12 points).", breed, d.getBreed() );
        }
    }

    /**
     * Testing setting and getting color
     */
    @Test(timeout=2000)
    public void colorTest()
    {
        String[] colors = { "brown", "black", "dapple" };
        Dog d = new Dog();
        for( String color : colors )
        {
            d.setColor( color );
            assertEquals( "setColor() or getColor() failed (-12 points).", color, d.getColor() );
        }
    }

    /**
     * Testing speak method
     */
    @Test(timeout=2000)
    public void speakTest()
    {
        Dog d = new Dog();
        assertTrue( "speak() failed (-10 points).", d.speak().length() > 0 );
    }

    /**
     * Testing toString method
     */
    @Test(timeout=2000)
    public void toStringTest()
    {
        Dog d = new Dog();
        assertTrue( "toString() failed (-10 points).", d.toString().length() > 0 );
    }
}
