### Structural Design Pattern - Flyweight

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/flyweight.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>FlyweightFactory</td>
    <td>Provides instances of flyweights</td>
  </tr>
  <tr>
    <td>Flyweight</td>
    <td>Interface for flyweight and method to receive state</td>
  </tr>
  <tr>
    <td>ConcreteFlyweight</td>
    <td>Non-Shared objects</td>
  </tr>
  <tr>
    <td>UnsharedConcreteFlyweight</td>
    <td>Implements methods provided by state</td>
  </tr>
  <tr>
    <td>Client</td>
    <td>Computes state of used flyweight</td>
  </tr>
  
</table>

<hr>
Description
This pattern provides ways to decrease object count thus improving application required objects structure.In addition to, it is used when we need to create a large number of similar objects. One important feature of flyweight objects is that they are immutable. It means that they cannot be modified once they have been constructed

For example :

```
public interface Piece {

}

public class APiece implements Piece {

}

public class BPiece implements Piece {

}

public class PieceFactory {

    private static final Map<String, Piece> pieceMap = new HashMap();

    public static Piece getPiece(String pieceType) {
        Piece piece = null;

        if (pieceMap.get(pieceType) != null) {
            piece = pieceMap.get(pieceType);
        } else {
            if (pieceType.equalsIgnoreCase("APiece")) {
                piece = new APiece();
            } else if (pieceType.equalsIgnoreCase("BPiece")) {
                piece = new BPiece();
            } 
            pieceMap.put(pieceType, piece);
        }

        return piece;
    }
}

```

