class TwoDim {
int x, y;
TwoDim(int a, int b) {
x = a;
y=b;
}
}
class ThreeDim extends TwoDim {
int z;
ThreeDim(int a, int b, int c){
super(a,b);
z=c;
}
}
class FourDim extends ThreeDim {
int t;
FourDim(int a, int b, int c, int d){
super(a,b,c);
t=d;
}
}
class Coords<T extends TwoDim>{
T[] crds;
Coords(T[] o) { crds = o;}
}
class gen_bound{
static void displayXY(Coords<?> c) {
System.out.println("X Y Coordinates:");
for(int i=0; i<c.crds.length; i++)
System.out.println(c.crds[i].x+" " + c.crds[i].y);
System.out.println();
}
static void displayXYZ(Coords<? extends ThreeDim> c) {
System.out.println("X Y Z Coordinates:");
for(int i=0; i<c.crds.length; i++)
System.out.println(c.crds[i].x + " " + c.crds[i].y + " " + c.crds[i].z);
System.out.println();
}
static void displayAll(Coords<? extends FourDim> c) {
System.out.println("X Y Z T Coordinates:");
for(int i=0; i<c.crds.length; i++)
System.out.println(c.crds[i].x + " " + c.crds[i].y + " " + c.crds[i].z + " " + c.crds[i].t);
System.out.println();
}
public static void main(String args[]){
TwoDim tdcrd[]={
new TwoDim(0,0),
new TwoDim(4,4),
new TwoDim(12,7),
new TwoDim(-5,-63)
};
Coords<TwoDim> tdcrds =  new Coords<TwoDim>(tdcrd);
System.out.println("Contents of tdlocs.");
displayXY(tdcrds);
FourDim fdcrd[] = {
new FourDim(1,2,3,4),
new FourDim(6,5,14,5),
new FourDim(3,4,5,6),
new FourDim(4,-3,-23,27)
};
Coords<FourDim> fdcrds =  new Coords<FourDim>(fdcrd);
System.out.println("Contents of fdlocs.");
displayXY(fdcrds);
displayXYZ(fdcrds);
displayAll(fdcrds);
}
}

