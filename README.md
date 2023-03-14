# 13-03-2023-Assignment

### 1. Create program for the given pattern:
*****
*****
*****
*****
*****

```java
public class Pattern1
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
```

OUTPUT: 

![p1](https://user-images.githubusercontent.com/93427086/224884978-91ac10e5-29ba-448e-8418-d86cc22a9776.png)




### 2. Create program for the given pattern:
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
 
```java
public class Pattern2
{
    public static void main(String[] args)
    {
        for(int i=5;i>=0;i--)
        {
            for(int j=0;j<=5-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
```

OUTPUT:

![p2](https://user-images.githubusercontent.com/93427086/224884997-a4b274a2-3c40-4fbc-81d5-ea8be2fda51d.png)



### 3. Create program for the given pattern:
* 
* * 
* * * 
* * * * 
* * * 
* * 
*

```java

public class Pattern3 {
    public static void main(String[] args)
    {
        int a = 4;
        for(int i=0;i<=a-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        for(int i=a-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}
```

OUTPUT:

![P3](https://user-images.githubusercontent.com/93427086/224885016-84dee49d-4e2a-4d22-bc55-a1ba9bb01cc4.png)































