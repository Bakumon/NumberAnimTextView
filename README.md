# NumberAnimTextView

![NumberAnimTextView演示gif](https://github.com/Bakumon/NumberAnimTextView/raw/master/gif/GIF.gif)

## Character

1. 添加前缀、后缀
2. 支持任意大小的整数或小数
3. 千位分隔符
4. API 简单

## Usage

```java
// 设置最终值，开始动画
mNumberAnimTextView.setNumberString("98765432.75");
```
## Option

```java
// 设置前缀
mNumberAnimTextView.setPrefixString("¥");
// 设置后缀
mNumberAnimTextView.setPostfixString("%");
// 设置动画时长
mNumberAnimTextView.setDuration(2000);
// 设置数字增加范围
mNumberAnimTextView.setNumberString("19.75", "99.75");
```
