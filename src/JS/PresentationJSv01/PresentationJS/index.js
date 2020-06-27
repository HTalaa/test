
// clock en setInterval
let spawn = false
function clocktick(){
  ennemyPositionUpdate();
  if (spawn)
    spawn();
    
  !spawn;
}
let interval = gameUpdate(clocktick,1000);