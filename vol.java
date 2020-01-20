class box
{
int slen;
int sbre;
int swid;
box()
{
}
void setvol(int slength,int sbreath,int swidth)
{
this.slength=slength;
this.sbreath=sbreath;
this.swidth=swidth;
}
void getvol()
{
System.out.println("volumn of the box is"+slen*sbre*swid);
}
void calculatevol()
{
int v=slength*sbreath*swidth;
return v;
}
}