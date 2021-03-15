import java.util.Random;

/**
 * Beschreiben Sie hier die Klasse Sortieralgorithmen.
 * 
 * @author Tim 
 * @version 0.1
 */
public class Sortieralgorithmen
{
    private Random zufallsgenerator = new Random();
    private int[] zufallszahlen = new int[10];
    
    
    /**
     * Konstruktor der Klasse Sortieralgorithmen
     */
    public Sortieralgorithmen()
    {
        arrayBefuellen();
        bubblesort();
        arrayAusgeben();
    }

    
    public void arrayBefuellen()
    {
        for(int i=0; i < zufallszahlen.length; i++)
        {
            zufallszahlen[i] = zufallsgenerator.nextInt(100);
        }
    }
    
    
    public void arrayAusgeben()
    {
        for(int i=0; i < zufallszahlen.length; i++)
        {
            System.out.print(zufallszahlen[i] + " ");
        }
    }
    
    public void tausche(int index1, int index2)
    {
        int merke = zufallszahlen[index1];
        zufallszahlen[index1] = zufallszahlen[index2];
        zufallszahlen[index2] = merke;
    }
    
    public void bubblesort()
    {
        // Gehe einmal durch das Array komplett hindurch
        for (int durchlauf = 1; durchlauf < zufallszahlen.length; durchlauf++) { 
            // Gehe durch den noch unsortierten Bereich
            for (int index = 0; index < zufallszahlen.length - durchlauf; index++) { 
               if (zufallszahlen[index] > zufallszahlen[index + 1]) {
                  tausche(index, index + 1);
               }
            }
        }
    }
}