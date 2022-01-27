let
  sources = import ./nix/sources.nix;
  pkgs = import sources.nixpkgs { };
in with pkgs;
mkShell {
  name = "node-env";
  buildInputs = [
    nodejs-12_x
    nodePackages.yarn
    openjdk11
    leiningen
    clojure
    clojure-lsp
    jq
    #neovim disable for macosx
    openssl
    unzip
    zip
    direnv
  ];
  shellHook = ''
    unset SOURCE_DATE_EPOCH
  '';

}
