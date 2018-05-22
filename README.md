**Iconify** offers you a **huge collection of vector icons** to choose from, and an intuitive way to **add and customize them in your Android app**.

This project is base on [JoanZapata/android-iconify](https://github.com/JoanZapata/android-iconify). Because of the owner gived up to update that project,

-----

### Install

Pick any number of modules and declare them in your `Application`.

```gradle
repositories {
	...
	jcenter()
	...
}
dependencies {
    implementation 'com.fly.iconify:iconify-fontawesome:1.0.0' // (Font Awesome v5.0.13)
}
```

```java
// You may inherit a Application
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Iconify
            .with(new FontAwesomeModule()) // solid FontAwesome v5.0.13
            .with(new FontAwesomeLightModule()) // light FontAwesome v5.0.13
            .with(new FontAwesomeBrandsModule()) // brands FontAwesome v5.0.13
            .with(new FontAwesomeRegularIcons()); // regular FontAwesome v5.0.13
    }
}
```

### Show icons in text widgets

If you need to put an icon on a ```TextView``` or a ```Button```, use the ```{ }``` syntax. The icons act exactly like the text, so you can apply shadow, size and color on them!

- fa-*

	`FontAwesomeModule`
- fab-*

	`FontAwesomeBrandsModule`
- fal-*

	`FontAwesomeLightModule`
- far-*


	`FontAwesomeRegularIcons`

```xml
<com.fly.iconify.widget.IconTextView
    android:text="I {fa-heart-o} to {fal-code} on {far-android}"
    android:shadowColor="#22000000"
    android:shadowDx="3"
    android:shadowDy="3"
    android:shadowRadius="1"
    android:textSize="40sp"
    android:textColor="#FF..."
    ... />
```

<img src="graphics/androids.png" height="347">

### Icon options

* Shall you need to override the text size of a particular icon, the following syntax is supported `{fa-code 12px}`, `{fa-code 12dp}`, `{fa-code 12sp}`, `{fa-code @dimen/my_text_size}`, and also `{fa-code 120%}`.
* In the same way you can override the icon color using `{fa-code #RRGGBB}`, `{fa-code #AARRGGBB}`, or `{fa-code @color/my_color}`.
* You can even easily spin an icon like so `{fa-cog spin}`.

<img src="graphics/spinning.gif" height="37">

### Show an icon where you need a `Drawable`

If you need an icon in an ```ImageView``` or in your ```ActionBar``` menu item, then you should use ```IconDrawable```. Again, icons are infinitely scalable and will never get fuzzy!

```java
// Set an icon in the ActionBar
menu.findItem(R.id.share).setIcon(
   new IconDrawable(this, FontAwesomeIcons.fa_share)
   .colorRes(R.color.ab_icon)
   .actionBarSize());
```

## Extensibility

In case you can't find the icon you want, you can extend the available icon directly from your app. All you need to do is to implement `IconFontDescriptor` with a `.ttf` file in your assets and provide the mapping between keys and special characters, then give it to `Iconify.with()`. You can use the  [FontAwesomeModule](https://github.com/fly-studio/android-iconify/blob/master/iconify-fontawesome/src/main/java/com/fly/iconify/fontawesome/module/FontAwesomeModule.java) as an example.

There are no constraints on the icon keys, but I strongly suggest you use a unique prefix like `my-` or anything, to avoid conflicts with other modules. FYI, if there **is** a conflict, the first module declared with `Iconify.with()` has priority.

The only dependency you need if you want to use a custom icon is Iconify core.

```gradle
implementation 'com.fly.iconify:iconify:2.2.2'
```

-----

## Contributions



## License

The android-iconify is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).