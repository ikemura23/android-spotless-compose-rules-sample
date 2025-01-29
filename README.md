# android-spotless-compose-rules-sample

Spotless + Compose rules を試す

## 概要

このプロジェクトは、Android プロジェクトで Spotless と Compose Rules を使用してコードフォーマットとリントチェックを行うサンプルです。

### 使用しているツール

-   [Spotless](https://github.com/diffplug/spotless) - コードフォーマッター
-   [Compose Rules](https://github.com/mrmans0n/compose-rules) - Jetpack Compose 用のリントルール

## コマンド一覧

| コマンド                        | 説明                                            | 実行タイミング        |
| ------------------------------- | ----------------------------------------------- | --------------------- |
| `./gradlew spotlessCheck`       | Spotless のフォーマットチェック（適用はしない） | コードレビュー前、CI  |
| `./gradlew spotlessApply`       | Spotless によるフォーマット適用                 | コード修正時          |
| `./gradlew spotlessKotlinCheck` | Kotlin ファイルのみのフォーマットチェック       | Kotlin ファイル修正時 |
| `./gradlew lint`                | Lint チェックを実行（全モジュール）             | コードレビュー前、CI  |
| `./gradlew :app:lint`           | app モジュールの Lint チェック                  | app モジュール修正時  |
| `./gradlew spotlessCheck lint`  | Spotless と Lint を同時に実行                   | コードレビュー前、CI  |
| `./gradlew lintDebug`           | Debug ビルド向けの Lint チェック                | デバッグ時            |
| `./gradlew lintRelease`         | Release ビルド向けの Lint チェック              | リリース前            |

## 設定されているルール

### Spotless

-   Kotlin コードフォーマット
-   インポート文の整理
-   末尾の空白削除
-   ファイル末尾の改行追加

### Compose Rules

-   コンポーザブル関数の命名規則
-   プレビュー関数の可視性
-   Modifier の使用方法
-   その他の Compose 関連のベストプラクティス

### 無効化されているルール

以下のルールは、プロジェクトの要件に合わせて無効化されています：

-   `ktlint_standard_package-name` - パッケージ名のアンダースコアを許可
-   `ktlint_standard_no-wildcard-imports` - ワイルドカードインポートを許可
-   `ktlint_standard_function-naming` - 関数名の命名規則を緩和
