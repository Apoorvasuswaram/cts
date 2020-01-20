class Box
{
int slength;
int sbreath;
int swidth;
/*public Box()
{
}*/
void setvol(int slength,int sbreath,int swidth)
{
this.slength=slength;
this.sbreath=sbreath;
this.swidth=swidth;
}
void getvol()
{
System.out.println("volumn of the box is"+slength*sbreath*swidth);
}
void calculatevol()
{
int v=slength*sbreath*swidth;
System.out.println("vol is:" +v);
}
}