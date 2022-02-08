(ns reveal.slides)

(def slide-1
  [:section
   [:p.beige "Knowledge sharing - 8th Feb"]
   [:a.link {:href "https://flowrite.com"} "Flowrite"]
   [:p.names "Karolus Sariola & Minaam Shahid"]
   [:div.row.offset-4
    [:div.col-3
     [:img {:src "img/avatar_karolus2.jpeg"}]]
    [:div.col-3
     [:img {:src "img/avatar_minaam.jpg"}]]]])

(def slide-2
  [:section
   [:p.subtitle "Agenda"]
   [:div.row
    [:div.offset-2.row-div.itemlist
     [:p "🔸 Intro to us and Flowrite & short demo"]
     [:p "🔸 Overview of the stack"]
     [:p "🔸 Why do we have challenges with environments?"]
     [:p "🔸 Solving the multiple environments challenge"]
     [:p "🔸 Deployment overview and future topics"]
     [:p "🔸 Questions and offtopic"]]]])

(def slide-20
  [:section
   [:div.col-8.offset-2
    [:p.subtitle "You can follow along with the screenshare only, BUT you can also clone the code and tinker with it"]]
   [:div.col-12
    [:img {:src "img/showmethecode.jpg"}]]
   [:div.row
    [:div.col-6.row-div
     [:a {:href "https://github.com/flowritecom/project-a-knowledge-transfer-skeleton-code"} "Python mock app"]]
    [:div.col-6.row-div
     [:a {:href "https://github.com/flowritecom/project-a-knowledge-transfer-vars-repo"} "Mock variable store"]]]])


(def slide-200
  [:section
   [:p.subtitle "Overview of the stack"]
   [:a.link {:href "https://whimsical.com/architecture-cloud-VCHYDubANwtU97f94jGRag"} "Link to Whimsical flowchart"]])


(def slide-21
  [:section
   [:p.subtitle "In rapid product development with both AI and UX, we often need many prototypes of possible releases"]
   [:div.col-10.offset-1
    [:img {:src "img/ai_engines.png"}]]])

(def slide-22
  [:section
   [:p.subtitle "With infrastructure-as-code, environment variables are the main input for spinning up any given structure"]
   [:div.row
    [:div.col-4.row-div
     [:img {:src "img/env1.png"}]]
    [:div.col-4.row-div
     [:img {:src "img/env2.png"}]]
    [:div.col-4.row-div
     [:img {:src "img/env3.png"}]]]])

(def slide-3
  [:section
   [:p.subtitle "Before you know it, it's ENV_VARs everywhere"]
   [:div.col-10.offset-1
    [:img {:src "img/buzz.jpg"}]]])

(def slide-4
  [:section
   [:p.subtitle "PAIN !!!"]
   [:div.col-8.offset-2
    [:img {:src "img/rage_face_meme.png"}]]])

(def slide-5
  [:section
   [:p.subtitle "Why?"]
   [:div.row
    [:div.offset-3.row-div.itemlist
     [:p "❌ Slow to edit across pipelines"]
     [:p "❌ Error-prone"]
     [:p "❌ No version control"]
     [:p "❌ No type checking"]
     [:p "❌ No code re-use"]
     [:p "❌ No secret fetching"]
     [:p "❌ Needs a redeploy to change"]]]])

(def slide-6
  [:section
   [:p.subtitle "Sound familiar?"]
   [:div.col-8.offset-2
    [:img {:src "img/hidethepainaharold.jpg"}]]])

(def slide-7
  [:section
   [:div
    [:div.beige
     [:p "❓❓Can we do better?❓❓"]]]])

(def slide-8
  [:section
   [:p.subtitle "Centralize the variables to Github"]
   [:div.row
    [:div.offset-3.row-div.itemlist
     [:p "✅ Fast to edit across pipelines"]
     [:p "✅ Less error-prone"]
     [:p "🤩 Version control"]
     [:p.old "❌ No type checking"]
     [:p.old "❌ No code re-use"]
     [:p.old "❌ No secret fetching"]
     [:p.old "❌ Needs a redeploy to change"]]]])


(def slide-9
  [:section
   [:p.subtitle "Git-versioned composable configs"]
   [:div.row
    [:div.col-6.row-div
     [:img {:src "img/dhall-hierarchy.png"}]]
    [:div.col-6.row-div
     [:img {:src "img/compose.png"}]]]])

(def slide-10
  [:section
   [:p.subtitle "Composable?"]
   [:div.col-6.offset-3
    [:img {:src "img/mother_of_god_meme.png"}]]])


(def slide-11
  [:section
   [:div
    [:div
     [:span.subtitle "Use "]
     [:a.subtitle {:href "https://github.com/dhall-lang/dhall-lang"} "Dhall"]
     [:span.subtitle " for great good!"]]]
   [:div.row
    [:div.offset-3.row-div.itemlist
     [:p.old "✅ Fast to edit across pipelines"]
     [:p.old "✅ Less error-prone"]
     [:p.old "🤩 Version control"]
     [:p "✅ First-class type checking"]
     [:p "✅ Composable"]
     [:p.old "❌ No secret fetching"]
     [:p.old "❌ Needs a redeploy to change"]]]])

(def slide-12
  [:section
   [:p.subtitle "Static type-checking"]
   [:p.names "We haven't yet got to this 😓"]
   [:div.row
    [:div.col-6.row-div
     [:img {:src "img/compile_time_type_checking.png"}]]
    [:div.col-6.row-div
     [:img {:src "img/static_type_checking.png"}]]]])

(def slide-13
  [:section
   [:p.subtitle "Use Dhall to define hierarchical structures"]
   [:div.col-8.offset-2
    [:img {:src "img/github.png"}]]])


(def slide-14
  [:section
   [:p.subtitle "AWS Secret Management is not bad"]
   [:div.row
    [:div.offset-3.row-div.itemlist
     [:p.old "✅ Fast to edit across pipelines"]
     [:p.old "✅ Less error-prone"]
     [:p.old "🤩 Version control"]
     [:p.old "✅ First-class type checking"]
     [:p.old "✅ Composable"]
     [:p "✅ Flexible secret fetching"]
     [:p.old "❌ Needs a redeploy to change"]]]])

(def slide-15
  [:section
   [:p.subtitle "Python prestep script that fetches secrets"]
   [:div.col-12
    [:img {:src "img/prestep.png"}]]])

(def slide-16
  [:section
   [:p.subtitle "Fetch at run-time"]
   [:div.row
    [:div.offset-2.row-div.itemlist
     [:p.old "✅ Fast to edit across pipelines"]
     [:p.old "✅ Less error-prone"]
     [:p.old "🤩 Version control"]
     [:p.old "✅ First-class type checking"]
     [:p.old "✅ Composable"]
     [:p.old "✅ Flexible secret fetching"]
     [:p "✅ Changes propagated without redeploy"]]]])

(def slide-17
  [:section
   [:p.subtitle "Pull variables inside the entrypoint of a container 👀"]
   [:div.col-12
    [:img {:src "img/entrypoint.png"}]]])


(def slide-18
  [:section
   [:p.names "Going a bit deeper into the deployment"]
   [:a.link {:href "https://whimsical.com/containerized-deploy-LwDiEaUAP6mBkWrc9aTZ8H"} "Whimsical flowchart (draft level)"]])

(def slide-19
  [:section
   [:p.subtitle "The End"]
   [:div.col-6.offset-3
    [:img {:src "img/ending.png"}]]
   [:a.link-ending {:href "https://github.com/flowritecom/project-a-knowledge-transfer"} "👉 slides"]])

(defn all
  "Add here all slides you want to see in your presentation."
  []
  [slide-1
   slide-2
   slide-20
   slide-200
   slide-21
   slide-22
   slide-3
   slide-4
   slide-5
   slide-6
   slide-7
   slide-8
   slide-9
   slide-10
   slide-11
   slide-12
   slide-13
   slide-14
   slide-15
   slide-16
   slide-17
   slide-18
   slide-19])