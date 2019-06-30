

```python
import random as ra

class Deck(object): 
    
    #de=[]
     
    #for i in range(4):
    #    for j in range(13):
    #       de.append((i,j))
                    
    #print(de)
    
    def draw(j):
        
        card=[]
    
        for k in range (j):  
            if(1<2):

                a=ra.randrange(0,4)            
                b=ra.randrange(1,13+1)    
                
                
                if a ==0:
                    a="♥"
                elif a==1:
                    a="♣"
                elif a==2:
                    a="♦"
                elif a==3:
                    a="♠"
                   
                if b ==1:
                    b="A"
                elif b==11:
                    b="J"
                elif b==12:
                    b="Q"
                elif b==13:
                    b="K"
                     
                
                while((a,b)in card):

                    a=ra.randrange(0,4)            
                    b=ra.randrange(1,13+1) 
                    
                    if a ==0:
                        a="♥"
                    elif a==1:
                        a="♣"
                    elif a==2:
                        a="♦"
                    elif a==3:
                        a="♠"

                    if b ==1:
                        b="A"
                    elif b==11:
                        b="J"
                    elif b==12:
                        b="Q"
                    elif b==13:
                        b="K"

                
                if a ==0:
                    a="♥"
                elif a==1:
                    a="♣"
                elif a==2:
                    a="♦"
                elif a==3:
                    a="♠"
                   
                if b ==1:
                    b="A"
                elif b==11:
                    b="J"
                elif b==12:
                    b="Q"
                elif b==13:
                    b="K"
                     
                    
                if(k==0):
                    card.append((a,b)) 

                    yield(a,b)  
                 

                while((a,b) not in card): 
                    
                    if(k<4 or k>=9):
        
                        if a ==0:
                            a="♥"
                        elif a==1:
                            a="♣"
                        elif a==2:
                            a="♦"
                        elif a==3:
                            a="♠"
                        if b ==1:
                            b="A"
                        elif b==11:
                            b="J"
                        elif b==12:
                            b="Q"
                        elif b==13:
                            b="K"
                            
                        
                        card.append((a,b)) 
                        yield(a,b) 
                
                    
                    if((k>=4)and(k<9)): 
                        
                        
                        a=ra.randrange(0,2) 
                        
                        
                        if a ==0:
                            a="♥"
                        elif a==1:
                            a="♠"
                            
                        b="Joker"
                               

                        card.append((a,b)) 
                        yield(a,b)   

Deck.draw(100)

print(Deck.draw(100))

for i in (Deck.draw(100)):
    print(i)
```

    <generator object Deck.draw at 0x00000197AEB91E08>
    ('♣', 'K')
    ('♠', 4)
    ('♥', 6)
    ('♥', 5)
    ('♥', 'Joker')
    ('♠', 'Joker')
    ('♥', 'Joker')
    ('♠', 'Joker')
    ('♠', 'Joker')
    ('♠', 6)
    ('♦', 'J')
    ('♦', 'Q')
    ('♠', 'A')
    ('♠', 2)
    ('♦', 8)
    ('♣', 4)
    ('♦', 'K')
    ('♣', 'J')
    ('♠', 5)
    ('♠', 'J')
    ('♣', 9)
    ('♣', 6)
    ('♠', 3)
    ('♣', 2)
    ('♦', 2)
    ('♥', 3)
    ('♥', 2)
    ('♥', 8)
    ('♣', 3)
    ('♣', 10)
    ('♦', 3)
    ('♦', 'A')
    ('♣', 8)
    ('♥', 'J')
    ('♥', 'A')
    ('♥', 'Q')
    ('♠', 10)
    ('♦', 9)
    ('♥', 4)
    ('♠', 8)
    ('♥', 10)
    ('♠', 9)
    ('♠', 'Q')
    ('♦', 10)
    ('♦', 7)
    ('♦', 4)
    ('♦', 5)
    ('♣', 5)
    ('♠', 'K')
    ('♦', 6)
    ('♥', 7)
    ('♣', 'A')
    ('♥', 9)
    ('♥', 'K')
    ('♣', 7)
    ('♣', 'Q')
    ('♠', 7)
    
