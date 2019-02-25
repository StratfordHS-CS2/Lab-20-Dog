public class DogRunner
{
    public static void main( String[] args )
    {
        // make a new instance of the class "Dog" with the default values
        Dog fluffy = new Dog();
        fluffy.setAge( 5 );
        fluffy.setName( "Fluffy" );
        fluffy.setBreed( "Poodle" );
        fluffy.setColor( "White" );
        System.out.println( fluffy );
        System.out.println( "Fluffy says " + fluffy.speak() );
        
        Dog rex = new Dog();
        rex.setAge( 2 );
        rex.setName( "Rex" );
        rex.setBreed( "Boxer" );
        rex.setColor( "Brown" );
        System.out.println( rex );
        System.out.println( "Rex says " + rex.speak() );
    }
}