/**

*

* @author R. Springer

* "authore2 W.Schaegen

*/

public class TileFactory {

/**

* Creates a Tile object based on the mapIcon number you give

*

* @param mapIcon number

* @return Tile tile object

*/

public static Tile createTile(int mapIcon) {

Tile tile;

switch (mapIcon) {

case 82:
tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 65:
tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 17:
tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 92:
tile = new Tile("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 90:
tile = new Lava("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 1:
tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 88:
tile = new Ladder("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 142:
tile = new Tile("snowHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 140:
tile = new Tile("snowHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 28:
tile = new Tile("castleHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 27:
tile = new Tile("castleHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 26:
tile = new Tile("castleHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 173:
tile = new LavaRemove("lavaRemove.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 51:
tile = new Tile("dirtHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 49:
tile = new Tile("dirtHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 56:
tile = new Tile("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 172:
tile = new Chain("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 165:
tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

case 126:
tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 95:
tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 93:
tile = new Water("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 102:
tile = new RopeAttached("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

case 104:
tile = new RopeVertical("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;

default:
tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;

}
return tile;
}
}
