Instrucciones de ejecución

Asegúrate de tener instalado (dnf para Fedora):
```
$ sudo apt-get install unzip
$ sudo apt-get install zip
$ sudo apt-get install sed
```
Instala sdkman:

$ curl -s "https://get.sdkman.io" | bash

Si ya habías instalado sdkman antes de unzip/zip/sed, desinstala:

$ tar zcvf ~/sdkman-backup_$(date +%F-%kh%M).tar.gz -C ~/ .sdkman
$ rm -rf ~/.sdkman

Abre una nueva terminal o ingresa en la actual:

$ source "$HOME/.sdkman/bin/sdkman-init.sh"

Corre lo siguiente para verificar instalación correcta:

$ sdk version
