# Lecture 2

## 1.Adding Methods

```java
public static void NAME() 
{
    STATEMENTS
}
```

For example:

```java
class Newline {
  public static void newline() {
    System.out.println("");
  }
  public static void threelines() {
    newline();
    newlien();
    newline();
  }
  public static void main(String[] arguments){
    System.out.println("Line 1");
    threeLines();
    System.out.println("Line 2");
  }
}
```

## 2.scope and pass by value

### 1.Scope

```java
class scope {
  int x=5;
  if(x==5) {
    int x=6;
    int y=72;
    System.out.println("x="+x+"y="+y);*wrong:cannot find symbol*
  }
}
```

### 2. Pass by Value

```java
class squarechange {
  public static void printsquare(int x) {
    System.out.println("printsquare x="+x);
    x=x*x;
    System.out.println("printSquare x="+x);
  }
  public static void main(String[] arguments) {
    int x=5;
    System.out.println("main x="+x);
    printsquare(x);
    System.out.println("main x="+x);
  }
}
```
