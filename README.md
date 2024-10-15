# Skill Builder 4 - Grok Coalition Continues!

## Learning Outcomes

After completing this Skill Builder, a student will be able to

1. Implement simple classes
2. Use and implement if-then-else statements to control decisions

## The Grok Coalition
Continuing with our <span style="font-family:'courier',courier new; font-weight:bold;">Grok</span>,   it is time to limit the power level of instances of 
<span style="font-family:'courier',courier new; font-weight:bold;">Grok</span>. In this Skill Builder, the Grok's maximum attainable power level will be set by a named constant.  This named constant is defined in the Grok class as,

```
private static final int MAX_POWER_LEVEL = 100;
```


In the Grok.java template,  The only method that is new and needs to be implementation is, `isDead()`.  However, based on the desription below, you will need to figure out what methods need to be modified in order to accomplish the two objectives, which are

1. Making sure that the Grok's energy level never exceeds a maximum level as set by `MAX_POWER_LEVEL`
2. Implement the death of a Grok and making sure the Grok can never be revived.

## The Grok Class

This class needs to be modified so that an instance of 
<span style="font-family:'courier',courier new; font-weight:bold;">Grok</span> cannot attain a 
power level greater than the maximum power level allowed, set by the constant 
<span style="font-family:'courier',courier new; ">MAXIMUM_POWER_LEVEL</span>.  If the client tries to create an instance of 
<span style="font-family:'courier',courier new; font-weight:bold;">Grok</span> with a power level 
greater than the maximum allowed, the grok's power level is set to the maximum power level allowed.  If a pill 
is taken that increases a grok's power level above the maximum allowed, that grok's power 
level should be set to the maximum power level.  In other words, a grok's 
power level should never exceed the maximum allowed power level.

If an instance of <span style="font-family:'courier',courier new; font-weight:bold;">Grok</span> 
has its power level decrease below zero (0), then that grok's power level should be set to zero (0), 
and the instance variable <span style="font-family:'courier',courier new; color:green;">isAlive</span> 
should be set to <span style="font-family:'courier',courier new; color:blue;">false</span>.  The accessor 
method <span style="font-family:'courier',courier new; ">isDead()</span> should be implemented.  When a 
<span style="font-family:'courier',courier new; font-weight:bold;">Grok</span> object is first created, 
the <span style="font-family:'courier',courier new; ">isDead()</span> method should return 
<span style="font-family:'courier',courier new; color:blue;">false</span>, unless the Grok is created
with a zero or negative power level.  In that case, a Grok object's `isDead` method should return true.  <span style="color:red;">Once dead,
a Grok's power level remains at zero (0) and its ```isDead()```
method always returns true, no matter how many PowerPill objects you feed it!</spamn>

## Assignment

In this Skill Builder, you will need to implment the `isDead` 
method in the `Grok` class.  In addition, you will need
to figure out the changes necessary in the other methods so that the Grok's power level never exceeds the maximum
power level allowed (given by `MAXIMUM_POWER_LEVEL`).  You 
will also need to figure out what methods to change to ensure that the Grok's power level never decreases below zero (0)
and that when the level reaches zero (0), the method `isDead()` should return 
<span style="font-family:'courier',courier new; color:blue;">true</span>. Again, once dead, `isDead` should never return a `false` no matter how many PowerPill objects the Grok is fed.
