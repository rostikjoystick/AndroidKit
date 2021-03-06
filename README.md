# Android Kit
Фреймворк для Android разработки

## Использование

В корневом `build.gradle` необходимо подключить репозиторий
```groovy
allprojects {
    repositories {
        maven { url "https://dl.bintray.com/eadm/ru.nobird.android" }
    }
}
```

## Артефакты

### AdapterDelegates
[ ![Download](https://api.bintray.com/packages/eadm/ru.nobird.android/ru.nobird.android.ui.adapterdelegates/images/download.svg) ](https://bintray.com/eadm/ru.nobird.android/ru.nobird.android.ui.adapterdelegates/_latestVersion)

Делегаты для адаптеров списков

```groovy
dependencies {
    implementation 'ru.nobird.android.ui:AdapterDelegates:x.y.z'
}
```

### Adapters
[ ![Download](https://api.bintray.com/packages/eadm/ru.nobird.android/ru.nobird.android.ui.adapters/images/download.svg) ](https://bintray.com/eadm/ru.nobird.android/ru.nobird.android.ui.adapters/_latestVersion)

Набор расширений для адаптеров списков, включая автоматическое обновление через diff callback и работу с выделением

```groovy
dependencies {
    implementation 'ru.nobird.android.ui:Adapters:x.y.z'
}
```

### Model
[ ![Download](https://api.bintray.com/packages/eadm/ru.nobird.android/ru.nobird.android.core.model/images/download.svg) ](https://bintray.com/eadm/ru.nobird.android/ru.nobird.android.core.model/_latestVersion)

Набор базовых классов и расширений для моделей

```groovy
dependencies {
    implementation 'ru.nobird.android.core.model:x.y.z'
}
```

### domain-rx
[ ![Download](https://api.bintray.com/packages/eadm/ru.nobird.android/ru.nobird.android.domain/images/download.svg) ](https://bintray.com/eadm/ru.nobird.android/ru.nobird.android.domain/_latestVersion)

Расширения для работы с RxJava

```groovy
dependencies {
    implementation 'ru.nobird.android.domain:rx:x.y.z'
}
```

### presentation-base
База для presentation слоя

```groovy
dependencies {
    implementation 'ru.nobird.android.presentation:base:1.1.0'
}
```

### presentation-redux
База для presentation-redux слоя, является альтернативой presentation-base

```groovy
dependencies {
    implementation 'ru.nobird.android.presentation:redux:1.1.0'
}
```

### presentation-redux-rx
Набор расширений для presentation-redux архитектуры с RxJava 2

```groovy
dependencies {
    implementation 'ru.nobird.android.presentation:redux-rx:1.1.0'
}
```

### view-injection

Набор расширений для DI

```groovy
dependencies {
    implementation 'ru.nobird.android.view:injection:1.0.1'
}
```

### view-navigation

Набор расширений для навигации через [Cicerone](https://github.com/terrakok/Cicerone)

```groovy
dependencies {
    implementation 'ru.nobird.android.view:navigation:1.0.2'
}
```

### view-ui

Набор UI расширений

```groovy
dependencies {
    implementation 'ru.nobird.android.view:ui:1.0.8'
}
```

### view-redux

Набор UI расширений для redux архитектры

```groovy
dependencies {
    implementation 'ru.nobird.android.view:redux:1.0.8'
}
```
